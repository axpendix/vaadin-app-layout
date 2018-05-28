package com.github.appreciated.app.layout.behaviour;

import com.github.appreciated.app.layout.builder.design.AppLayoutDesign;
import com.github.appreciated.app.layout.builder.elements.*;
import com.github.appreciated.app.layout.builder.interfaces.ComponentFactory;
import com.github.appreciated.app.layout.builder.interfaces.NavigationElementComponent;
import com.github.appreciated.app.layout.webcomponents.applayout.AppDrawer;
import com.github.appreciated.app.layout.webcomponents.appmenu.AppMenu;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.util.List;

/**
 * The interface every AppLayout Variant is required to be implemented to allow any {@link com.github.appreciated.app.layout.builder.AbstractAppLayoutBuilderBase} to build it.
 */

public interface AppLayoutElementBase {
    default void toggleDrawer() {
        getDrawer().getElement().callFunction("toggle");
    }

    default void openDrawer() {
        getDrawer().getElement().callFunction("open");
    }

    default void closeDrawerIfNotPersistent() {
        UI.getCurrent().getPage().executeJavaScript("if(!document.querySelector('app-drawer').hasAttribute('persistent')){document.querySelector('app-drawer').closeDrawer();}");
    }

    default void closeDrawer() {
        getDrawer().getElement().callFunction("toggle");
    }

    String getStyleName();

    void addToDrawerHeader(Component component);

    void addToDrawer(Component component);

    void addToDrawerFooter(Component component);

    void addToTopHeader(Component component);

    void addToTop(Component component);

    void addToTopFooter(Component component);

    void addNavigationHeaderElement(AbstractNavigationElement component);

    void addNavigationFooterElement(AbstractNavigationElement component);

    void addNavigationElement(AbstractNavigationElement component);

    void addAppBarElement(Component component);

    void setDesign(AppLayoutDesign design);

    HorizontalLayout getAppBarElementWrapper();

    HasElement getTitleComponent();

    AppDrawer getDrawer();

    void setTitle(String title);

    void setTitleElement(HasElement titleComponent);

    HasElement getTitleWrapper();

    AppMenu getMenuElementHolder();

    AppMenu getMenuFooterHolder();

    AppMenu getMenuHeaderHolder();

    void addAppBarIcon(Component appBarIconComponent);

    void setNavigatorNavigationElements(List<NavigatorNavigationElement> list);

    void refreshNavigationElementInfo();

    ComponentFactory<NavigationElementComponent, NavigatorNavigationElement> getDrawerNavigationElementProvider();

    void setDrawerNavigationElementProvider(ComponentFactory<NavigationElementComponent, NavigatorNavigationElement> provider);

    ComponentFactory<NavigationElementComponent, NavigatorNavigationElement> getTopNavigationElementProvider();

    void setTopNavigationElementProvider(ComponentFactory<NavigationElementComponent, NavigatorNavigationElement> provider);

    ComponentFactory<HasElement, SectionNavigationElement> getDrawerSectionElementProvider();

    void setDrawerSectionElementProvider(ComponentFactory<HasElement, SectionNavigationElement> provider);

    ComponentFactory<HasElement, SectionNavigationElement> getTopSectionElementProvider();

    void setTopSectionElementProvider(ComponentFactory<HasElement, SectionNavigationElement> provider);

    ComponentFactory<SubmenuNavigationElement.SubmenuElement, SubmenuNavigationElement> getDrawerSubmenuElementProvider();

    void setDrawerSubmenuElementProvider(ComponentFactory<SubmenuNavigationElement.SubmenuElement, SubmenuNavigationElement> provider);

    ComponentFactory<SubmenuNavigationElement.SubmenuElement, SubmenuNavigationElement> getTopSubmenuElementProvider();

    void setTopSubmenuElementProvider(ComponentFactory<SubmenuNavigationElement.SubmenuElement, SubmenuNavigationElement> provider);

    ComponentFactory<HasElement, ClickableNavigationElement> getDrawerClickableElementProvider();

    void setDrawerClickableElementProvider(ComponentFactory<HasElement, ClickableNavigationElement> provider);

    ComponentFactory<HasElement, ClickableNavigationElement> getTopClickableElementProvider();

    void setTopClickableElementProvider(ComponentFactory<HasElement, ClickableNavigationElement> provider);

    void setAppLayoutContent(HasElement content);
}