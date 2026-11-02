.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AITranslatorText;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/util/MicrosoftSDKManage;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/sma/smartv3/util/MicrosoftSDKManage;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/sma/smartv3/util/MicrosoftSDKManage;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->OXO1:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->XIi00iiXO:Lcom/sma/smartv3/util/MicrosoftSDKManage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AITranslatorText;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslatorText;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslatorText;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_1

    const v0, 0x7f140bb1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->XIi00iiXO:Lcom/sma/smartv3/util/MicrosoftSDKManage;

    invoke-static {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i010I(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  toTranslatorText  error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    const v0, 0x7f140bb1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AITranslatorText;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$toTranslatorText$1;->OXO1(Lcom/sma/smartv3/model/AITranslatorText;)V

    return-void
.end method
