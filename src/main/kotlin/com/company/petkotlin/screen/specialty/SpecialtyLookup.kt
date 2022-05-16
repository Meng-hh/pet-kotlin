package com.company.petkotlin.screen.specialty

import io.jmix.ui.screen.*
import com.company.petkotlin.entity.Specialty

@UiController("pet_Specialty.lookup")
@UiDescriptor("specialty-lookup.xml")
@LookupComponent("specialtiesTable")
class SpecialtyLookup : StandardLookup<Specialty>()