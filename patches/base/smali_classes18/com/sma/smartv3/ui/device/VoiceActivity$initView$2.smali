.class public final Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/VoiceActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
        "Lcom/sma/smartv3/biz/voice/VoiceMessage;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/VoiceActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/VoiceActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/voice/VoiceMessage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    new-instance p2, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;

    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    new-instance p2, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;

    invoke-direct {p2, p1, p0}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    new-instance p2, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;

    invoke-direct {p2, p1, p0}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)V

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    new-instance p2, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;

    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-void
.end method

.method public static final synthetic access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method
