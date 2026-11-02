.class public final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public play(Ljava/lang/String;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->access$getAudioPlayer(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OXO1(Ljava/lang/String;)V

    return-void
.end method
