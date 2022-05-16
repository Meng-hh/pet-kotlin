package com.company.petkotlin.screen.veterinarian

import com.company.petkotlin.entity.Veterinarian
import io.jmix.core.EntityStates
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*
import org.springframework.beans.factory.annotation.Autowired

@UiController("pet_Veterinarian.edit")
@UiDescriptor("veterinarian-edit.xml")
@EditedEntityContainer("veterinarianDc")
@Route(value = "veterinarians/edit", parentPrefix = "veterinarians")
class VeterinarianEdit : StandardEditor<Veterinarian>(){
    @Autowired
    private lateinit var messageBundle: MessageBundle

    @Autowired
    private lateinit var entityStates: EntityStates


    @Subscribe
    private fun onAfterShow(event: AfterShowEvent) {
        window!!.caption=editorTitleLabel()
    }
    private fun editorTitleLabel():String?{
        if (entityStates.isNew(editedEntity))
            return "新建宠物医生"
        else
            return "宠物医生：s%"
    }

}