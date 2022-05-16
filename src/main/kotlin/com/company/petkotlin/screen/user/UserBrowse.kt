package com.company.petkotlin.screen.user

import com.company.petkotlin.entity.User
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*

@UiController("pet_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
open class UserBrowse : StandardLookup<User>()