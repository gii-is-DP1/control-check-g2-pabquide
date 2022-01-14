package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Pet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Feeding extends BaseEntity{
    
    @NotEmpty
    @Column(name = "start_date")        
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate startDate;

    @NotEmpty
    @Column(name="weeks_duration")
    @Size(min=1)
    double weeksDuration;

    @ManyToOne
    @NotEmpty
    @NotNull
    Pet pet;   

    @ManyToOne
    @NotNull
    @JoinColumn(name="feeding_type_id")
    FeedingType feedingType;
}
