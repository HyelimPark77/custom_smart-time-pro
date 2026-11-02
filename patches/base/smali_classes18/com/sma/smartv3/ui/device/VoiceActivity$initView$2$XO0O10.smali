.class public final Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/device/VoiceActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$resetPlayStatus(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->XOO0ii0(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/VoiceActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->I0IIOi(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    return-void
.end method

.method private static final XOO0ii0(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;ILandroid/view/View;)V
    .locals 3

    sget-object p4, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {p4}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    invoke-virtual {p4}, Lcom/android/mltcode/paycertificationapi/fq1;->XIi00iiXO()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v0

    invoke-virtual {p4}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$resetPlayStatus(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    if-ne v0, v1, :cond_0

    const p0, 0x7f081303

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p2

    const-string v0, "mAdapter"

    const/4 v2, 0x0

    if-nez p2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p2, v2

    :cond_1
    invoke-virtual {p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMStatus(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMExtraInfo()Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p4, p0, p2, p3, v2}, Lcom/android/mltcode/paycertificationapi/fq1;->O00(Lcom/android/mltcode/paycertificationapi/fq1;Ljava/lang/String;IILjava/lang/Object;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p0

    :goto_0
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ti6;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/ti6;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;)V

    const-wide/16 p3, 0xfa0

    invoke-virtual {p0, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public IiI10X(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0d0b

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a066d

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    check-cast v0, Landroid/widget/ImageView;

    const v2, 0x7f0813c2

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    const v0, 0x7f0a01df

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/VoiceActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ui6;

    invoke-direct {v1, p2, v0, p1, p3}, Lcom/android/mltcode/paycertificationapi/ui6;-><init>(Lcom/sma/smartv3/biz/voice/VoiceMessage;Lcom/sma/smartv3/ui/device/VoiceActivity;Landroid/widget/ImageView;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public OIi0(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMType()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->OIi0(Lcom/sma/smartv3/biz/voice/VoiceMessage;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f2d

    return v0
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/VoiceActivity$initView$2$XO0O10;->IiI10X(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/biz/voice/VoiceMessage;I)V

    return-void
.end method
