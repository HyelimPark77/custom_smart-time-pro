.class public final Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;
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


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/VoiceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

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

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p2
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;->O00(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f30

    return v0
.end method

.method public XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V
    .locals 0

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "t"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0d0b

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f0a066d

    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    check-cast p1, Landroid/widget/ImageView;

    const p3, 0x7f0813c4

    invoke-static {p2, p3}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p3

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$OXO1;->XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V

    return-void
.end method
