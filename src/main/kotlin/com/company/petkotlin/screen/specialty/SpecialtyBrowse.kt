package com.company.petkotlin.screen.specialty

import com.company.petkotlin.entity.Specialty
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.LookupComponent
import io.jmix.ui.screen.MasterDetailScreen
import io.jmix.ui.screen.UiController
import io.jmix.ui.screen.UiDescriptor

@UiController("pet_Specialty.browse")
@UiDescriptor("specialty-browse.xml")
@LookupComponent("table")
@Route(value = "specialities")
class SpecialtyBrowse : MasterDetailScreen<Specialty>()