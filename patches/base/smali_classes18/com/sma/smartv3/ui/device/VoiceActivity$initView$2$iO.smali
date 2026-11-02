.class public final Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/biz/voice/VoiceMessage;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/VoiceActivity;Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/device/VoiceActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$resetPlayStatus(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/VoiceActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->I0IIOi(Lcom/sma/smartv3/ui/device/VoiceActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->XOO0ii0(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V
    .locals 3

    sget-object p4, Lcom/sma/smartv3/biz/voice/VoicePlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoicePlayer;

    invoke-virtual {p4}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->isPlay()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v0

    invoke-virtual {p4}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->stop()V

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$resetPlayStatus(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    if-ne v0, v1, :cond_0

    const p0, 0x7f081303

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p2

    const/4 v0, 0x0

    const-string v2, "mAdapter"

    if-nez p2, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p2, v0

    :cond_1
    invoke-virtual {p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMStatus(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMExtraInfo()Ljava/lang/String;

    move-result-object p0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/si6;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/si6;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    invoke-virtual {p4, p0, p2}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->play(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p0

    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public IiI10X(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    const v1, 0x7f1414b7

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v1, 0x7f0a0cf4

    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;->access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f0607a5

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const v0, 0x7f0a0cf5

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMTitle$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a01df

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const v0, 0x7f081304

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    :cond_1
    const v0, 0x7f081303

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ri6;

    invoke-direct {v1, p2, v0, p1, p3}, Lcom/android/mltcode/paycertificationapi/ri6;-><init>(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public OIi0(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMType()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->OIi0(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f2f

    return v0
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$iO;->IiI10X(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V

    return-void
.end method
