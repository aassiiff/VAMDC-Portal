package org.domain.registrybrowser.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import org.domain.registrybrowser.entity.test;

@Name("testHome")
public class testHome extends EntityHome<test>
{
    @RequestParameter Long testId;

    @Override
    public Object getId()
    {
        if (testId == null)
        {
            return super.getId();
        }
        else
        {
            return testId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

}
