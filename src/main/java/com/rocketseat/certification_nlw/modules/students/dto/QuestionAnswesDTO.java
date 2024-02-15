package com.rocketseat.certification_nlw.modules.students.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionAnswesDTO {

    private UUID question_id;

    private UUID alternative_id;

    private boolean isCorrect;

}
