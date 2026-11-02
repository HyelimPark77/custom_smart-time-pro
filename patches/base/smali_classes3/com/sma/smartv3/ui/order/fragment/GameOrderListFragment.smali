.class public final Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;
.super Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1869#2,2:182\n99#3,7:184\n106#3,3:192\n79#3,7:195\n109#3:202\n1#4:191\n*S KotlinDebug\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n*L\n115#1:182,2\n174#1:184,7\n174#1:192,3\n174#1:195,7\n174#1:202\n174#1:191\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1869#2,2:182\n99#3,7:184\n106#3,3:192\n79#3,7:195\n109#3:202\n1#4:191\n*S KotlinDebug\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n*L\n115#1:182,2\n174#1:184,7\n174#1:192,3\n174#1:195,7\n174#1:202\n174#1:191\n*E\n"
    }
.end annotation


# instance fields
.field private itemOrderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;-><init>()V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->setOrderType(Ljava/lang/String;)V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->showGameConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData$lambda$0$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->getOrderList$lambda$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData$lambda$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData$lambda$0$0$1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II0IiXX;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/II0IiXX;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OIIIiiI0;

    invoke-direct {p2, p0, p1, p3}, Lcom/android/mltcode/paycertificationapi/OIIIiiI0;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p3, p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p5}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->initItem(Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/model/OrderContentData;I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OrderContentData;->getOrderNum()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    move-object p6, p4

    move p4, p5

    move-object p5, p2

    new-instance p2, Lcom/android/mltcode/paycertificationapi/XIXi0X0iX;

    move-object p7, p3

    move-object p3, p0

    invoke-direct/range {p2 .. p7}, Lcom/android/mltcode/paycertificationapi/XIXi0X0iX;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;)V

    const p0, 0x7f0a019a

    invoke-virtual {p6, p0, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const p0, 0x7f0a06fe

    invoke-virtual {p6, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XXi00XiI;

    invoke-direct {p1, p6}, Lcom/android/mltcode/paycertificationapi/XXi00XiI;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->deleteRecord(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->deleteOrder(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p3}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p1, 0x2

    const/4 p3, 0x0

    if-eqz p0, :cond_1

    const/4 p5, 0x0

    invoke-static {p0, p2, p5, p1, p3}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;ZILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p5, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p4, p5, p3, p1, p3}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0, p3, p5, p3}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private static final findData$lambda$0$0$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final findData$lambda$0$0$1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "view"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OrderContentData;->getOrderNum()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OrderContentData;->getPayStatus()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/XXiO;->XO0O10(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_0

    iget-object p3, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OrderContentData;->getOrderNum()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OrderList itemClick itemClick itemOrderNum = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " orderNum = "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OrderContentData;->getOrderNum()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->showGameConfirm(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, p1, p2}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu$default(Lcom/angcyo/dsladapter/SwipeMenuHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getOrderList$lambda$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AccountOrderData;->getContent()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$1$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->setAdapter$lambda$0$1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final setAdapter$lambda$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f0d0f5d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO11;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XO11;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslLoadMoreItem()Lcom/angcyo/dsladapter/DslLoadMoreItem;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iIi1i0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iIi1i0;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslLoadMoreItem;->setOnLoadMore(Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/i010Oi;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/i010Oi;-><init>()V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiX10i1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiX10i1OI;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-static {p0, v3, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMoreEnable(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$1(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/i10Iii;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/i10Iii;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$1$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getPageNum()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->setPageNum(I)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getPageNum()I

    move-result v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/i1XiXOiX0;

    invoke-direct {v3, p0, p1}, Lcom/android/mltcode/paycertificationapi/i1XiXOiX0;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/OrderManager;->OIi0(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/model/AccountOrderData;)Lkotlin/Unit;
    .locals 12

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AccountOrderData;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AccountOrderData;->getContent()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AccountOrderData;->getContent()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setAdapter$lambda$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showGameConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderType()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OrderList orderType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " orderNum = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->setNeedPayDialog(Z)V

    sget-object v1, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/OrderManager;->X0O()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/sma/smartv3/biz/OrderManager;->XiOIO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v1, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return v0
.end method


# virtual methods
.method public final findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/angcyo/dsladapter/DslAdapter;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OrderContentData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getOrderType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "findData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " mData = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/OrderContentData;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0OiXOi;

    invoke-direct {v1, p0, v0, p1}, Lcom/android/mltcode/paycertificationapi/X0OiXOi;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Lcom/sma/smartv3/model/OrderContentData;Lcom/angcyo/dsladapter/DslAdapter;)V

    const v0, 0x7f0d0efc

    invoke-static {p1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getItemOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderList()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->II1Xi0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->i010I()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->getPageNum()I

    move-result v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/X000;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/X000;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/OrderManager;->OIi0(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final initItem(Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/model/OrderContentData;I)V
    .locals 7
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/OrderContentData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a08dc

    invoke-virtual {p1, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0a08d7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a08d9

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a08dd

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a08da

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    const v4, 0x7f14107d

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz p3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    if-eqz p3, :cond_2

    const v3, 0x7f14107e

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OrderContentData;->getAmount()F

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v6}, Lcom/android/mltcode/paycertificationapi/XXiO;->iO(FLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OrderContentData;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OrderContentData;->getOrderNum()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OrderContentData;->getCreatedAt()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const v0, 0x7f06074b

    if-eqz p3, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_6
    const p3, 0x7f0a08db

    invoke-virtual {p1, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OrderContentData;->getPayStatus()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/XXiO;->XO0O10(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    const p2, 0x7f141081

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p2

    goto :goto_0

    :cond_7
    const p2, 0x7f141080

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f06053b

    invoke-static {p2, p3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_8
    return-void
.end method

.method public setAdapter()V
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIIO00XXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIIO00XXX;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/fragment/BaseOrderListFragment;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

    return-void
.end method

.method public final setItemOrderNum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;->itemOrderNum:Ljava/lang/String;

    return-void
.end method

.method public final showGameConfirm(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "orderNum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f140c95

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1410a8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO1iI000I;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IO1iI000I;-><init>(Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;Ljava/lang/String;)V

    const p1, 0x7f14162b

    invoke-virtual {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method
