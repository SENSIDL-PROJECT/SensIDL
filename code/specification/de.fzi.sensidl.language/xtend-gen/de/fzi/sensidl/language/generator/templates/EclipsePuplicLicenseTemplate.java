package de.fzi.sensidl.language.generator.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EclipsePuplicLicenseTemplate {
  public static CharSequence getText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright (c) 2016 Red Hat");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved. This program and the accompanying materials");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* are made available under the terms of the Eclipse Public License v1.0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* and Eclipse Distribution License v1.0 which accompany this distribution.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The Eclipse Public License is available at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* \thttp://www.eclipse.org/legal/epl-v10.html");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* and the Eclipse Distribution License is available at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* \thttp://www.eclipse.org/org/documents/edl-v10.html.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
}
