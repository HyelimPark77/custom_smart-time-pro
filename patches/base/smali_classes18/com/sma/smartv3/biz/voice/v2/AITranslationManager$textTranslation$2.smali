.class public final Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->textTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

.field final synthetic $toLanguage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$toLanguage:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    const v0, 0x7f140bb1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$toLanguage:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    const-string v3, "cn"

    invoke-static {v0, p1, v3, v1, v2}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->access$translateITS(Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$textTranslation$2;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    const v0, 0x7f140bb1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method
