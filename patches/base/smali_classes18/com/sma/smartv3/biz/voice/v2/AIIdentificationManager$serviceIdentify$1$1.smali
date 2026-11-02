.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentify$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->serviceIdentify()V
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x7f1414b0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const v0, 0x7f1414af

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendError(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_1
    const-string v0, "5003"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_2
    const-string v0, "5002"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_3
    const-string v0, "5001"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_4
    const-string v0, "4006"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const-string v2, "AI_VOICE_TIP_MEMBER"

    invoke-virtual {v0, v2, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_5
    const-string v0, "2004"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendError(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const p1, 0x7f140e38

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1774c2 -> :sswitch_5
        0x185d82 -> :sswitch_4
        0x18d1dc -> :sswitch_3
        0x18d1dd -> :sswitch_2
        0x18d1de -> :sswitch_1
        0x33c587 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentify$1$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "{}"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p1

    if-eqz p1, :cond_1

    const v0, 0x7f1414b0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
