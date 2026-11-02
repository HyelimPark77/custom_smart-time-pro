.class public final Lcom/sma/smartv3/ui/sport/SportListActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isEdit:Z

.field public mAllList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mAllRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mBtnList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mChangeDataTypeBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHotRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mTopList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final spanCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zz4;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a05;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a05;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mHotRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b05;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b05;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mAllRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c05;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c05;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mChangeDataTypeBtn$delegate:Lkotlin/Lazy;

    const/4 v0, 0x4

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->spanCount:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportListActivity;ZILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setViewHolder$lambda$2(Lcom/sma/smartv3/ui/sport/SportListActivity;ZILandroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportListActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->mChangeDataTypeBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->mHotRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->mAllRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportListActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$setViewHolder(Lcom/sma/smartv3/ui/sport/SportListActivity;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;IIZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;IIZ)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/view/View;)V
    .locals 2

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMChangeDataTypeBtn()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f1404b8

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/a15;->XO0O10(Ljava/util/List;)V

    const-string p1, "SPORT_MODE_TOP_LIST_CHANGE"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMChangeDataTypeBtn()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f1411c4

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMAllRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method private static final mAllRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a00b7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mChangeDataTypeBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0223

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mHotRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportListActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0bcd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final setAllList()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setBtnListData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMAllRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->spanCount:I

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMAllRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMBtnList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/sport/SportListActivity$setAllList$1;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportListActivity$setAllList$1;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/app/Activity;Ljava/util/List;)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_1
    return-void
.end method

.method private final setBtnListData()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMBtnList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMAllList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMBtnList()Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final setHotListView()V
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/a15;->XIi00iiXO()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setMTopList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->spanCount:I

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/app/Activity;Ljava/util/List;)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_1
    return-void
.end method

.method private final setViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;IIZ)V
    .locals 4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0a0b20

    invoke-virtual {p1, v1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v0

    const v1, 0x7f0a0b1e

    invoke-virtual {p1, v1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0816fd

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0816fc

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_0
    const v0, 0x7f0a0b1f

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    const/16 v2, 0x8

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    if-eqz p4, :cond_2

    const v3, 0x7f081761

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v3, 0x4

    if-lt p3, v3, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    const p3, 0x7f08175f

    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ge p3, v2, :cond_5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_5
    :goto_1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/yz4;

    invoke-direct {p3, p0, p4, p2}, Lcom/android/mltcode/paycertificationapi/yz4;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;ZI)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final setViewHolder$lambda$2(Lcom/sma/smartv3/ui/sport/SportListActivity;ZILandroid/view/View;)V
    .locals 1

    iget-boolean p3, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    if-eqz p3, :cond_5

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x4

    if-lt p1, p2, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setBtnListData()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 p3, 0x8

    if-ge p1, p3, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMTopList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setBtnListData()V

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMAllRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_4
    return-void

    :cond_5
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p3

    const-class v0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;

    invoke-direct {p1, p3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "mArg1"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMAllList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mAllList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mAllList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMAllRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mAllRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getMBtnList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mBtnList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mBtnList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMChangeDataTypeBtn()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mChangeDataTypeBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMHotRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mHotRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getMTopList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mTopList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mTopList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSpanCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->spanCount:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f14011a

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/a15;->OXO1()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setMAllList(Ljava/util/List;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setMBtnList(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setHotListView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->setAllList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportListActivity;->getMChangeDataTypeBtn()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xz4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xz4;-><init>(Lcom/sma/smartv3/ui/sport/SportListActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final isEdit()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0113

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setEdit(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->isEdit:Z

    return-void
.end method

.method public final setMAllList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mAllList:Ljava/util/List;

    return-void
.end method

.method public final setMBtnList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mBtnList:Ljava/util/List;

    return-void
.end method

.method public final setMTopList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity;->mTopList:Ljava/util/List;

    return-void
.end method
