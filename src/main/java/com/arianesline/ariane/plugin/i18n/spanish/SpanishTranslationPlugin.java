package com.arianesline.ariane.plugin.i18n.spanish;

import com.arianesline.ariane.plugin.api.AbstractTranslationPlugin;
import java.util.Locale;

public class SpanishTranslationPlugin extends AbstractTranslationPlugin {

  public SpanishTranslationPlugin() {
    super(Locale.of("es"), "/com/arianesline/ariane/plugin/i18n/spanish/ui_es.properties");
  }

  @Override
  public String getName() {
    return "Spanish Translation Plugin";
  }
}
