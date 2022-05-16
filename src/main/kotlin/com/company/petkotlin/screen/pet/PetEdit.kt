package com.company.petkotlin.screen.pet

import io.jmix.ui.screen.*
import com.company.petkotlin.entity.Pet

@UiController("pet_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
class PetEdit : StandardEditor<Pet>()