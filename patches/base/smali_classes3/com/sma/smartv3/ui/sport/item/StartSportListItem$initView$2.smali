.class public final Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const v0, 0x7f0d1064

    invoke-direct {p0, p2, v0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;->convert$lambda$2(Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;ILandroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$2(Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;ILandroid/view/View;)V
    .locals 2

    new-instance p2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-class v1, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "mArg1"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V
    .locals 3

    const-string p3, "itemHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string v0, "mContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    .line 3
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    .line 4
    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    .line 5
    invoke-static {p3, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result p3

    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p3

    const v1, 0x7f0a0b20

    invoke-virtual {p1, v1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 6
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    .line 7
    invoke-virtual {v0, p2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    .line 8
    invoke-static {p3, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result p3

    const v0, 0x7f0a0b1e

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 9
    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 10
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    const v0, 0x7f0816fd

    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    const v0, 0x7f0816fc

    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 12
    :goto_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/h85;

    invoke-direct {p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/h85;-><init>(Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;I)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V

    return-void
.end method
