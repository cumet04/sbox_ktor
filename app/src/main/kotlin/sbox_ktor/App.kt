package sbox_ktor

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    val s =
            embeddedServer(Netty, 8080) {
                routing { get("/") { call.respondText("Hello, world!", ContentType.Text.Html) } }
            }
    s.start(wait = true)
}
