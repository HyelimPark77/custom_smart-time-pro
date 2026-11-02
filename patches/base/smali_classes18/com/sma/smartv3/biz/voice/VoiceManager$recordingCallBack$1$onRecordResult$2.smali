.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1;->onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
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
.field final synthetic $result:Lcom/sma/smartv3/model/AITranslation;

.field final synthetic $toLanguage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AITranslation;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;->$result:Lcom/sma/smartv3/model/AITranslation;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;->$toLanguage:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f1414af

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;->handleResponse(Ljava/lang/String;)V

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
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;->$result:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cn"

    iget-object v3, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;->$toLanguage:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$translateITS(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f1414af

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
