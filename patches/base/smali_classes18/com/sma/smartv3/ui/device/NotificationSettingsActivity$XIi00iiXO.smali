.class public final Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;
.super Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->showDefaultList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
        "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic X11iII1O1:Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/X1Oi0i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;->X11iII1O1:Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;

    const p1, 0x7f0d0ef9

    invoke-direct {p0, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/XII0Oi10O;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;->XOO0ii0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;ILandroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->O00(Z)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->iO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notification_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public IiI10X(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/X1Oi0i;I)V
    .locals 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;->X11iII1O1:Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->OXO1()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const v1, 0x7f0a0638

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->I0iXXO(ILandroid/graphics/drawable/Drawable;)Lcom/android/mltcode/paycertificationapi/ug6;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XIi00iiXO()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0a0cc7

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->iO()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notification_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->O00(Z)V

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/X1Oi0i;->XO0O10()Z

    move-result v0

    const v1, 0x7f0a022e

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->IO(IZ)Lcom/android/mltcode/paycertificationapi/ug6;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fb1;

    invoke-direct {v0, p2, p3}, Lcom/android/mltcode/paycertificationapi/fb1;-><init>(Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;I)V

    invoke-static {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/vg6;->OXO1(Lcom/android/mltcode/paycertificationapi/ug6;ILandroid/view/View$OnClickListener;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/android/mltcode/paycertificationapi/X1Oi0i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;->IiI10X(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/X1Oi0i;I)V

    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity$XIi00iiXO;->X11iII1O1:Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/NotificationSettingsActivity;->getMDefaultList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
