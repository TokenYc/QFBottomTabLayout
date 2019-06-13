package com.samluys.tab;


import com.samluys.tablib.QFTabEntity;

public class TabEntity implements QFTabEntity {
    public String title;
    public int selectedIcon;
    public int unSelectedIcon;
    public int tabCoverIcon;
    public boolean isPublish;
    public boolean isNewPage;

    public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    public TabEntity(String title, int selectedIcon, int unSelectedIcon, int tabCoverIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.tabCoverIcon = tabCoverIcon;
    }

    public TabEntity(String title, int selectedIcon, int unSelectedIcon, int tabCoverIcon, boolean isPublish) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.tabCoverIcon = tabCoverIcon;
        this.isPublish = isPublish;
    }

    public TabEntity(String title, int selectedIcon, int unSelectedIcon, int tabCoverIcon, boolean isPublish, boolean isNewPage) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.tabCoverIcon = tabCoverIcon;
        this.isPublish = isPublish;
        this.isNewPage = isNewPage;
    }

    public TabEntity(String title) {
        this.title = title;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }

    @Override
    public int getTabCoverIcon() {
        return tabCoverIcon;
    }

    @Override
    public boolean getIsPublish() {
        return isPublish;
    }

    @Override
    public boolean getIsNewPage() {
        return isNewPage;
    }


}
