.class public final Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/permission/PermissionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/util/permission/PermissionFragment;->XIi00iiXO()Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;

    move-result-object v0

    return-object v0
.end method

.method public final XIi00iiXO(Landroid/app/Activity;Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;Lcom/android/mltcode/paycertificationapi/wg1;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/android/mltcode/paycertificationapi/wg1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/util/permission/PermissionFragment;->IO:Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/util/permission/PermissionFragment$OXO1;->iO(Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;)V

    invoke-static {p3}, Lcom/sma/smartv3/util/permission/PermissionFragment;->iO(Lcom/android/mltcode/paycertificationapi/wg1;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/util/permission/PermissionFragment;

    invoke-direct {p3}, Lcom/sma/smartv3/util/permission/PermissionFragment;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public final iO(Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/permission/PermissionFragment;->XO0O10(Lcom/sma/smartv3/util/permission/PermissionFragment$PermissionType;)V

    return-void
.end method
