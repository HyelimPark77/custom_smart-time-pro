.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AlipaySetActivity;->changeDeviceState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/androidnetworklib/model/Response<",
        "Lcom/sma/smartv3/model/DeviceState;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n*L\n189#1:926,8\n189#1:935,5\n189#1:934\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n*L\n189#1:926,8\n189#1:935,5\n189#1:934\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Landroid/app/Activity;

.field public final synthetic XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

.field public final synthetic iO:Lcom/android/mltcode/paycertificationapi/uq;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->OXO1:Landroid/app/Activity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->iO:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/androidnetworklib/model/Response;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/androidnetworklib/model/Response<",
            "Lcom/sma/smartv3/model/DeviceState;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->OXO1:Landroid/app/Activity;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->iO:Lcom/android/mltcode/paycertificationapi/uq;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "responseData"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez p1, :cond_0

    new-instance p1, Lcom/sma/androidnetworklib/model/Response;

    invoke-direct {p1}, Lcom/sma/androidnetworklib/model/Response;-><init>()V

    const/16 v4, -0x3e8

    invoke-virtual {p1, v4}, Lcom/sma/androidnetworklib/model/Response;->setCode(I)V

    :cond_0
    invoke-virtual {v0, v1, p1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->responseWhenCheck(Landroid/app/Activity;Lcom/sma/androidnetworklib/model/Response;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->iO:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {v0, p1, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->errorData(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;->OXO1(Lcom/sma/androidnetworklib/model/Response;)V

    return-void
.end method
