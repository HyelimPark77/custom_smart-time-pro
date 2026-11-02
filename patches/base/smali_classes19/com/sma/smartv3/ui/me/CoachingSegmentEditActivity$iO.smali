.class public final Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->setActivity(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/android/mltcode/paycertificationapi/iXIiIiO;

.field public final synthetic IO:Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;Lcom/android/mltcode/paycertificationapi/iXIiIiO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->IO:Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->I1:Lcom/android/mltcode/paycertificationapi/iXIiIiO;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;ILcom/android/mltcode/paycertificationapi/iXIiIiO;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->XIi00iiXO(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;ILcom/android/mltcode/paycertificationapi/iXIiIiO;Landroid/view/View;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;ILcom/android/mltcode/paycertificationapi/iXIiIiO;Landroid/view/View;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMSegment$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object p3

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMActivities$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)[Lcom/szabh/smable3/entity/SegmentActivity;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/szabh/smable3/entity/BleCoachingSegment;->setMActivity(I)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$updateActivity(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)V

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->IO:Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMActivities$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)[Lcom/szabh/smable3/entity/SegmentActivity;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    new-instance p2, Landroid/widget/ImageView;

    iget-object p3, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->IO:Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;

    invoke-static {p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMContext(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)Landroid/app/Activity;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->IO:Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity$iO;->I1:Lcom/android/mltcode/paycertificationapi/iXIiIiO;

    invoke-static {p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMGridItemPadding$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)I

    move-result v1

    invoke-static {p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMGridItemPadding$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v1, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    const v1, 0x7f06074b

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p2, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-static {p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;->access$getMActivities$p(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;)[Lcom/szabh/smable3/entity/SegmentActivity;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ic_segment_activity"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "drawable"

    const v3, 0x7f081062

    invoke-static {p3, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/X1OOO;->OXO1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO0IXO1O;

    invoke-direct {v1, p3, p1, v0}, Lcom/android/mltcode/paycertificationapi/XO0IXO1O;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;ILcom/android/mltcode/paycertificationapi/iXIiIiO;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method
