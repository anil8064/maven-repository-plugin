package org.apache.maven.plugins.repository.stubs;

/*
 * Copyright 2005-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.model.Build;
import org.apache.maven.model.Scm;
import org.apache.maven.plugin.testing.stubs.MavenProjectStub;

/**
 * @author <a href="mailto:oching@exist.com">Maria Odea Ching</a>
 */
public class NoScmMavenProjectStub
    extends MavenProjectStub
{

    private Scm scm;

    private Build build;

    public NoScmMavenProjectStub()
    {
        setGroupId( "no.scm" );
        setArtifactId( "no-scm" );
        setVersion( "1.0-SNAPSHOT" );
        setName( "No Scm Project" );
        setUrl( "http://maven.apache.org" );
        setPackaging( "jar" );
        setDescription( "Sample Maven Project that has no scm specified in the pom." );

        Build build = new Build();
        build.setFinalName( "no-scm" );
        build.setDirectory( getBasedir() + "/target/test/unit/no-scm/target" );
        setBuild( build );

    }

    public Scm getScm()
    {
        return scm;
    }

    public void setScm( Scm scm )
    {
        this.scm = scm;
    }

    public Build getBuild()
    {
        return build;
    }

    public void setBuild( Build build )
    {
        this.build = build;
    }
}