.class final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n99#2,7:604\n106#2,3:612\n79#2,7:615\n109#2:622\n99#2,7:623\n106#2,3:631\n79#2,7:634\n109#2:641\n1#3:611\n1#3:630\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n*L\n366#1:604,7\n366#1:612,3\n366#1:615,7\n366#1:622\n387#1:623,7\n387#1:631,3\n387#1:634,7\n387#1:641\n366#1:611\n387#1:630\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment$initItem$2$1"
    f = "PayOnlineMoveFragment.kt"
    i = {}
    l = {
        0x163
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n99#2,7:604\n106#2,3:612\n79#2,7:615\n109#2:622\n99#2,7:623\n106#2,3:631\n79#2,7:634\n109#2:641\n1#3:611\n1#3:630\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n*L\n366#1:604,7\n366#1:612,3\n366#1:615,7\n366#1:622\n387#1:623,7\n387#1:631,3\n387#1:634,7\n387#1:641\n366#1:611\n387#1:630\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dialId:I

.field final synthetic $item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field final synthetic $position:I

.field final synthetic $progressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;IILcom/sma/smartv3/view/ProgressButtonV2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            "II",
            "Lcom/sma/smartv3/view/ProgressButtonV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iput p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$dialId:I

    iput p4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$position:I

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$progressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->invokeSuspend$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;
    .locals 6

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-static {p0, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-static {p0, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurProgressButton(Lcom/sma/smartv3/view/ProgressButtonV2;)V

    invoke-virtual {p0, p4}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurItem(Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {p5}, Lcom/sma/smartv3/model/AccountCreateOrder;->getOrderNum()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setOrderNum(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setNeedPayDialog(Z)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getOrderNum()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "WatchFace"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/OrderManager;->iIiiO(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string p3, "mArg0"

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 p3, 0x2

    invoke-virtual {p2, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, p3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p3

    const-class p4, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, p3, p4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const p1, 0x7f140bb0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/app/Activity;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lcom/bestmafen/androidbase/base/BaseActivity;

    invoke-virtual {p5}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    sget-object p5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p5}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result p5

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getDialPickerPopup$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p5

    const/4 v1, 0x1

    if-ne p5, v1, :cond_0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p5, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;

    move-object v4, p0

    move v5, p1

    move v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-direct {p5, v1, v2, v0, v3}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    invoke-static {v4, p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setDialPickerPopup$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;)V

    invoke-static {v4}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getDialPickerPopup$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const-string p2, "<get-recyclerView>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    move-object v4, p0

    move v5, p1

    move v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-static {v4, v5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-static {v4, v6}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-static {v4, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurProgressButton(Lcom/sma/smartv3/view/ProgressButtonV2;)V

    invoke-virtual {v4, v8}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurItem(Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v9, v8

    move-object v8, v7

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$syncDial(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iget v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$dialId:I

    iget v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$position:I

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$progressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;IILcom/sma/smartv3/view/ProgressButtonV2;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->label:I

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt;->OXO1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->IX0()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/android/mltcode/paycertificationapi/OOX1XIiOI;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/android/mltcode/paycertificationapi/OOX1XIiOI;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    goto :goto_1

    :cond_3
    const p1, 0x7f140435

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object p1

    const-string v0, "1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->Ii()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->iOO1ii1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3, v2, v1}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v3, 0x2

    invoke-virtual {v2, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v3, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_4

    :cond_5
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->OX()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result p1

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result p1

    :goto_2
    const/4 v3, 0x0

    cmpg-float p1, p1, v3

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPayStatus()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/XXiO;->XO0O10(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    sget-object p1, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Landroid/app/Activity;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$dialId:I

    iget v5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$position:I

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$progressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    new-instance v2, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    const-string v3, "WatchFace"

    invoke-virtual {p1, v3, v0, v1, v2}, Lcom/sma/smartv3/biz/OrderManager;->OXO1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v6, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$dialId:I

    iget v7, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$position:I

    iget-object v8, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$progressButton:Lcom/sma/smartv3/view/ProgressButtonV2;

    iget-object v9, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->$item:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    new-instance v4, Lcom/sma/smartv3/ui/device/dialpay/fragment/XIi00iiXO;

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/ui/device/dialpay/fragment/XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    const/4 p1, 0x0

    invoke-static {p1, v4, v2, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    :goto_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
