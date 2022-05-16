package com.company.petkotlin.screen.veterinarian

import com.company.petkotlin.entity.Veterinarian
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.LookupComponent
import io.jmix.ui.screen.StandardLookup
import io.jmix.ui.screen.UiController
import io.jmix.ui.screen.UiDescriptor

@UiController("pet_Veterinarian.browse")
@UiDescriptor("veterinarian-browse.xml")
@LookupComponent("veterinariansTable")
@Route(value = "veterinarians")
class VeterinarianBrowse : StandardLookup<Veterinarian>()