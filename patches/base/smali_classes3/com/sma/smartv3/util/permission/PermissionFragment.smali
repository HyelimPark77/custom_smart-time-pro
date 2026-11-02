.class public final Lcom/sma/smartv3/util/permission/PermissionFragment;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;,
        Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;,
        Lcom/sma/smartv3/util/permission/PermissionFragment$XIi00iiXO;
    }
.end annotation


# static fields
.field public static I1:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IO:Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static iX1O1:Lcom/android/mltcode/paycertificationapi/wg1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment;->IO:Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;

    sget-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;->AUTO_RUN:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    sput-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment;->I1:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static final IiI10X(ILcom/sma/smartv3/util/permission/PermissionFragment;)V
    .locals 1

    const/16 v0, 0x65

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc9

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    const-string v0, "getActivity(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/util/permission/XIi00iiXO;->XIi00iiXO(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/util/permission/PermissionFragment;->O00(Z)V

    return-void

    :cond_1
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/util/permission/PermissionFragment;->O00(Z)V

    return-void
.end method

.method public static synthetic OXO1(ILcom/sma/smartv3/util/permission/PermissionFragment;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/permission/PermissionFragment;->IiI10X(ILcom/sma/smartv3/util/permission/PermissionFragment;)V

    return-void
.end method

.method public static final synthetic XIi00iiXO()Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment;->I1:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    return-object v0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/util/permission/PermissionFragment;->I1:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    return-void
.end method

.method public static final synthetic iO(Lcom/android/mltcode/paycertificationapi/wg1;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/util/permission/PermissionFragment;->iX1O1:Lcom/android/mltcode/paycertificationapi/wg1;

    return-void
.end method


# virtual methods
.method public final O00(Z)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment;->iX1O1:Lcom/android/mltcode/paycertificationapi/wg1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/wg1;->OXO1(Z)V

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isSamsung()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isOppo()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Fragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_1
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Lcom/sma/smartv3/util/permission/PermissionFragment;->I1:Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    sget-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment$XIi00iiXO;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/sma/smartv3/util/permission/XIi00iiXO;->OXO1:Lcom/sma/smartv3/util/permission/XIi00iiXO;

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/util/permission/XIi00iiXO;->XO0O10(Landroid/app/Fragment;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/sma/smartv3/util/permission/OXO1;->OXO1:Lcom/sma/smartv3/util/permission/OXO1;

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/util/permission/OXO1;->IO(Landroid/app/Fragment;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    new-instance p3, Lcom/android/mltcode/paycertificationapi/nq1;

    invoke-direct {p3, p1, p0}, Lcom/android/mltcode/paycertificationapi/nq1;-><init>(ILcom/sma/smartv3/util/permission/PermissionFragment;)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
