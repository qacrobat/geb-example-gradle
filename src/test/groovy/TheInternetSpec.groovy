import geb.spock.GebReportingSpec
import pages.TheInternetPage

/**
 * Created by dbraun1 on 23.03.17.
 */
class TheInternetSpec extends GebReportingSpec {

    def "login successfully"() {
        given:
        to TheInternetPage
        formAuthenticationLink.click()

        when:
        loginTo("tomsmith", "SuperSecretPassword!")

        then:
        successMessage.isDisplayed()
    }
}
