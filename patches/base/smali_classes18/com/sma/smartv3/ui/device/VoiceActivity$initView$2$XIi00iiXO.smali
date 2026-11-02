.class public final Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public O00(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->O00(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f2e

    return v0
.end method

.method public XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V
    .locals 4

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "t"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    const v0, 0x7f1414b7

    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v0, 0x7f0a0cf4

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;->access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2;)Landroid/content/Context;

    move-result-object p3

    const v1, 0x7f0607a5

    invoke-static {p3, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const p3, 0x7f0a0cf5

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    check-cast p3, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMTitle$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0664

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0IIOI()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMTitle$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiiiOIIi0()I

    move-result v1

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMAIMode()I

    move-result p2

    const-string v2, "getString(...)"

    if-eqz p2, :cond_3

    const/4 v3, 0x2

    if-eq p2, v3, :cond_2

    const/4 v3, 0x3

    if-eq p2, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    const v0, 0x7f1410ab

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0813c6

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    const v0, 0x7f1400d8

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0813ca

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    const v0, 0x7f14150d

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0813c1

    :goto_1
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-static {p2, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XIi00iiXO;->XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V

    return-void
.end method
