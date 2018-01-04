package pages

import geb.Page

/**
 * Created by dbraun1 on 22.03.17.
 */
class TheInternetPage extends Page {

    static url = "http://the-internet.herokuapp.com/"
    static at = {title.contains("The Internet")}
    static content = {
        // links on the startpage
        formAuthenticationLink {$('a', text:'Form Authentication')}

        // login test
        inputUsername {$('input#username')}
        inputPassword {$('input#password')}
        loginBtn {$('button.radius')}
        successMessage {$('div#flash.flash.success')}

    }

    def loginTo(username, password) {
        inputUsername << username
        inputPassword << password
        loginBtn.click()
    }
}
