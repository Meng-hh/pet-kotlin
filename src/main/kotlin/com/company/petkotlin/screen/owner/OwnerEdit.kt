package com.company.petkotlin.screen.owner

import io.jmix.ui.screen.*
import com.company.petkotlin.entity.Owner
import io.jmix.core.LoadContext
import io.jmix.ui.screen.Target

@UiController("pet_Owner.edit")
@UiDescriptor("owner-edit.xml")
@EditedEntityContainer("ownerDc")
class OwnerEdit : StandardEditor<Owner>()
