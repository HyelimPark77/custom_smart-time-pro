.class public final Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoachingSegment;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

.field public final synthetic XIi00iiXO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    iput p2, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->XIi00iiXO:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->iO(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Z

    move-result p0

    return p0
.end method

.method public static final iO(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Z
    .locals 6

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMList(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDeleteFailedPopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMContext(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f140bb2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v2, 0x7f141205

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-static {v0, v5, v5, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const v2, 0x7f14034b

    invoke-static {v0, v2, v5, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;->X0i1O(Lcom/android/mltcode/paycertificationapi/go0;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$setMDeleteFailedPopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/android/mltcode/paycertificationapi/go0;)V

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDeleteFailedPopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMList(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMIndex$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$checkCount(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public OXO1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    iget v1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->XIi00iiXO:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$toEdit(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V

    return-void
.end method

.method public onDelete()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    iget v1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->XIi00iiXO:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$setMIndex$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDeletePopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMContext(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    const v3, 0x7f1403e8

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v3, 0x7f14027f

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3, v5, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OOi0iOO;

    invoke-direct {v3, v2}, Lcom/android/mltcode/paycertificationapi/OOi0iOO;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$setMDeletePopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/android/mltcode/paycertificationapi/go0;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDeletePopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
