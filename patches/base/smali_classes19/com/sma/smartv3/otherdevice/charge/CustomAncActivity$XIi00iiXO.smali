.class public final Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getMEarphoneAncSettings$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMAncModeList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getMEarphoneAncSettings$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAncMode;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$isRightEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$setRightEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Z)V

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/16 v1, 0x64

    int-to-float v2, v1

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/2addr p1, v1

    :goto_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result v1

    if-le p1, v1, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMRightMax()I

    move-result p1

    const v0, 0x7f140ed6

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getTvRightValue(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public XIi00iiXO(Ljava/lang/String;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getMEarphoneAncSettings$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMAncModeList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getMEarphoneAncSettings$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->getMMode()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleAncMode;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$isLeftEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$setLeftEdit$p(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;Z)V

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/16 v1, 0x64

    int-to-float v2, v1

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/2addr p1, v1

    :goto_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result v1

    if-le p1, v1, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAncMode;->getMLeftMax()I

    move-result p1

    const v0, 0x7f140ed6

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;->access$getTvRightValue(Lcom/sma/smartv3/otherdevice/charge/CustomAncActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
