package org.lebastudios.theroundtable.plugintemplate;

import org.lebastudios.theroundtable.controllers.PaneController;

public class MainPaneController extends PaneController<MainPaneController>
{
    @Override
    public Class<?> getBundleClass()
    {
        return PluginMainClass.class;
    }

    @Override
    public boolean hasFXMLControllerDefined()
    {
        return true;
    }
}
