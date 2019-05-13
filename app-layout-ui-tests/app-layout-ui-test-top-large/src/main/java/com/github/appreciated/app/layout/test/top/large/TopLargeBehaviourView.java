package com.github.appreciated.app.layout.test.top.large;

import com.github.appreciated.app.layout.component.applayout.Behaviour;
import com.github.appreciated.app.layout.test.top.large.view.View1;
import com.github.appreciated.app.layout.test.top.large.view.View2;
import com.github.appreciated.app.layout.test.top.large.view.View3;
import com.github.appreciated.app.layout.test.uis.left.AbstractTopBehaviorView;
import com.vaadin.flow.component.Component;

public class TopLargeBehaviourView extends AbstractTopBehaviorView {
    @Override
    public Behaviour getVariant() {
        return Behaviour.TOP_LARGE;
    }

    @Override
    public Class<? extends Component>[] getViews() {
        return new Class[]{View1.class, View2.class, View3.class};
    }


}
