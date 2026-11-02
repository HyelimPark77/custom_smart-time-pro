.class public final Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final IiI10X(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$updateTranslatorConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->I1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->OX(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1$OXO1;->IiI10X(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final O00(Lcom/sma/smartv3/model/LanguageTranslationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r87;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/r87;-><init>(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->II1Xi0(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1$1$OXO1;->O00(Lcom/sma/smartv3/model/LanguageTranslationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
