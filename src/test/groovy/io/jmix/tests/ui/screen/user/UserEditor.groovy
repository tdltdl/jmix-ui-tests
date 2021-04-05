package io.jmix.tests.ui.screen.user

import io.jmix.masquerade.Wire
import io.jmix.masquerade.base.Composite
import io.jmix.masquerade.component.Button
import io.jmix.masquerade.component.CheckBox
import io.jmix.masquerade.component.Table
import io.jmix.masquerade.component.TextField

class UserEditor extends Composite<UserEditor> {

    @Wire
    TextField usernameField
    @Wire
    TextField passwordField
    @Wire
    TextField confirmPasswordField
    @Wire
    TextField firstNameField
    @Wire
    TextField lastNameField
    @Wire
    TextField emailField
    @Wire
    CheckBox enabledField

    @Wire
    Button commitAndCloseBtn
    @Wire
    Button closeBtn
}
