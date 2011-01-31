package org.domain.registrybrowser.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import org.domain.registrybrowser.entity.test;

@Name("testList")
public class testList extends EntityQuery<test>
{
    public testList()
    {
        setEjbql("select test from test test");
    }
}
