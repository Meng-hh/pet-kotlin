package com.company.petkotlin.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.DependsOnProperties
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.core.metamodel.annotation.JmixProperty
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "PET_VISIT", indexes = [
    Index(name = "IDX_VISIT_ASSIGNED_NURSE_ID", columnList = "ASSIGNED_NURSE_ID"),
    Index(name = "IDX_VISIT_PET_ID", columnList = "PET_ID")
])
@Entity(name = "pet_Visit")
open class Visit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "ASSIGNED_NURSE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var assignedNurse: User? = null

    @Column(name = "VERSION")
    var version: Int? = null

    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var lastModifiedDate: Date? = null

    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var deletedDate: Date? = null

    @Column(name = "TYPE_", nullable = false)
    @NotNull
    private var type: String? = null

    @JoinColumn(name = "PET_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var pet: Pet? = null

    @Column(name = "VISIT_START")
    var visitStart: LocalDateTime? = null

    @Column(name = "VISTI_END")
    var vistiEnd: LocalDateTime? = null

    @InstanceName
    @Column(name = "DESCRIPTION")
    var description: String? = null

    @Column(name = "TREATMENT_STATUS")
    private var treatmentStatus: String? = null

    fun setType(type: VisitType?) {
        this.type = type?.id
    }

    fun getType(): VisitType? = type?.let { VisitType.fromId(it) }
    fun setTreatmentStatus(treatmentStatus: VisitTreatmentStatus?) {
        this.treatmentStatus = treatmentStatus?.id
    }

    fun getTreatmentStatus(): VisitTreatmentStatus? = treatmentStatus?.let { VisitTreatmentStatus.fromId(it) }

    @DependsOnProperties("pet")
    @JmixProperty
    fun getPetName(): String? = null


    @DependsOnProperties("type")
    @JmixProperty
    fun getTypeStyle(): String? = null


}