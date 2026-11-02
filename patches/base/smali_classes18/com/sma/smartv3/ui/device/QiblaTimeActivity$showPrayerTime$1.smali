.class public final Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->showPrayerTime(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/PrayerTime;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/QiblaTimeActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;->this$0:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;

    const v0, 0x7f0d0f07

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PrayerTime;I)V
    .locals 6

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    .line 2
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string v1, "mContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/PrayerTime;->getTimeName(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(I)V

    const p3, 0x7f0a188d

    .line 3
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PrayerTime;->getTimeString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/PrayerTime;->getAdjustmentMin()I

    move-result p3

    const v0, 0x7f0a0cbe

    .line 5
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz p3, :cond_0

    const v2, 0x7f140f5d

    .line 6
    invoke-static {p3, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IiI10X(II)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 7
    :cond_0
    const-string p3, ""

    .line 8
    :goto_0
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f0a06de

    .line 9
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    const-string v0, "getView(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x43480000    # 200.0f

    invoke-static {p3, v0}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const p3, 0x7f0a027d

    .line 10
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;->this$0:Lcom/sma/smartv3/ui/device/QiblaTimeActivity;

    .line 11
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {p3, v0}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    .line 12
    invoke-static {v2}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->access$getMNextPrayerTime$p(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/model/PrayerTime;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const v0, 0x7f0600b4

    .line 13
    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    :goto_1
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/sma/smartv3/model/PrayerTime;->getTimeIcon(Landroid/content/Context;)I

    move-result p2

    const p3, 0x7f0a0638

    invoke-virtual {p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/PrayerTime;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PrayerTime;I)V

    return-void
.end method
