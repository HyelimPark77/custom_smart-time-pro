.class public final Lcom/sma/smartv3/network/ToTranslatorText;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FLAG_ORIGINAL_LANGUAGE:Ljava/lang/String; = "originalLanguage"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_SOURCE:Ljava/lang/String; = "source"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_TEXT_FORM:Ljava/lang/String; = "textForm"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_TRANSLATION_LANGUAGE:Ljava/lang/String; = "translationLanguage"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/ToTranslatorText;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/translator/translatorText"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/ToTranslatorText;

    invoke-direct {v0}, Lcom/sma/smartv3/network/ToTranslatorText;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/ToTranslatorText;->INSTANCE:Lcom/sma/smartv3/network/ToTranslatorText;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
