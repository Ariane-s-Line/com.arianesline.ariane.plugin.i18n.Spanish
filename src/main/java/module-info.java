module com.arianesline.ariane.plugin.i18n.spanish {
  requires com.arianesline.ariane.plugin.api;

  opens com.arianesline.ariane.plugin.i18n.spanish;

  provides com.arianesline.ariane.plugin.api.TranslationPlugin with
      com.arianesline.ariane.plugin.i18n.spanish.SpanishTranslationPlugin;
}
