.class public Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment<",
        "Lcom/sma/smartv3/model/OrderContentData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n90#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n1#4:175\n*S KotlinDebug\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n*L\n138#1:167\n97#1:168,7\n97#1:176,3\n97#1:179,7\n97#1:186\n97#1:175\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n90#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n1#4:175\n*S KotlinDebug\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n*L\n138#1:167\n97#1:168,7\n97#1:176,3\n97#1:179,7\n97#1:186\n97#1:175\n*E\n"
    }
.end annotation


# instance fields
.field private isNeedPayDialog:Z

.field private mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;"
        }
    .end annotation
.end field

.field private final mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private orderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private orderType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private pageNum:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;-><init>()V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->setInitUpdate(Z)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->pageNum:I

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderNum:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->showConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->deleteOrder$lambda$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final deleteOrder$lambda$0(Z)Lkotlin/Unit;
    .locals 0

    if-eqz p0, :cond_0

    const p0, 0x7f1412e1

    goto :goto_0

    :cond_0
    const p0, 0x7f140baf

    :goto_0
    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->pageNum:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderList()V

    goto :goto_0

    :cond_0
    const p0, 0x7f1410a9

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;)Z
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderNum:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OrderList orderType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " orderNum = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    sget-object v1, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v2, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderNum:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/biz/OrderManager;->iIiiO(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const/4 v3, 0x2

    invoke-virtual {v2, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    const-class v4, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return v0
.end method


# virtual methods
.method public final deleteOrder(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "orderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O01OX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/O01OX;-><init>()V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/OrderManager;->iO(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final deleteRecord(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, p1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final getMDeletePopup()Lcom/android/mltcode/paycertificationapi/go0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    return-object v0
.end method

.method public getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method

.method public getOrderList()V
    .locals 0

    return-void
.end method

.method public final getOrderStatus()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderNum:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/IXiXO1;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/IXiXO1;-><init>(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/OrderManager;->XX0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getOrderType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    return-object v0
.end method

.method public final getPageNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->pageNum:I

    return v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final initList()Ljava/util/List;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "USER_ORDER_LIST_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, Lcom/sma/smartv3/model/AccountOrderData;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AccountOrderData;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AccountOrderData;->getContent()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mList:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->initList()Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderList()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->initView()V

    return-void
.end method

.method public final isNeedPayDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e7a

    return v0
.end method

.method public onDataChange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->onInitBaseLayoutAfter()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->setAdapter()V

    return-void
.end method

.method public final onOrderPayStatusChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ORDER_PAY_SUCCESS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onOrderPayStatusChange"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderList()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->pageNum:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderList()V

    :cond_0
    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;"
        }
    .end annotation

    const-string p2, "calendar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "timePeriod"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onTimePeriodChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->initList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a0996

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setAdapter()V
    .locals 0

    return-void
.end method

.method public final setMDeletePopup(Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/go0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method

.method public final setNeedPayDialog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->isNeedPayDialog:Z

    return-void
.end method

.method public final setOrderType(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderType:Ljava/lang/String;

    return-void
.end method

.method public final setPageNum(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->pageNum:I

    return-void
.end method

.method public final showConfirm(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "ordernum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->orderNum:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v0, 0x7f140c95

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f1410a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1i0iXXIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1i0iXXIi;-><init>(Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;)V

    const v1, 0x7f14162b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->mConfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
