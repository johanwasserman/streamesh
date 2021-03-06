package io.scicast.streamesh.core;

import io.scicast.streamesh.core.internal.reflect.InScope;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@With
@NoArgsConstructor
@AllArgsConstructor
@InScope
public class TaskInput {

    private String baseCmd;

    @InScope
    private List<TaskParameter> parameters = new ArrayList<>();

}
