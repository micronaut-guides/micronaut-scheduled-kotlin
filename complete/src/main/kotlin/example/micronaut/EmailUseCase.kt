package example.micronaut

import org.slf4j.LoggerFactory

import javax.inject.Singleton
import java.text.SimpleDateFormat
import java.util.Date

@Singleton
class EmailUseCase {

    fun send(user: String, message: String) {
        LOG.info("Sending email to {} : {} at {}", user, message, SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date()))
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(EmailUseCase::class.java) // <2>
    }
}
