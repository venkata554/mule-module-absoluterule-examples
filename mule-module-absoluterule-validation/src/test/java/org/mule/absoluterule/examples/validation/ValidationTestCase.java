package org.mule.absoluterule.examples.validation;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.tck.FunctionalTestCase;
import org.mule.util.IOUtils;

public class ValidationTestCase extends FunctionalTestCase
{

    public void testValidation() throws Exception
    {
        String contents = IOUtils.getResourceAsString("valid-instance.xml", this.getClass());
        MuleMessage message = new DefaultMuleMessage(contents, muleContext);
        muleContext.getClient().dispatch("vm://in", message);

        MuleMessage response = muleContext.getClient().request("vm://out", RECEIVE_TIMEOUT);
        assertNotNull(response);
    }

    @Override
    protected String getConfigResources()
    {
        return "validation-config.xml";
    }
}
