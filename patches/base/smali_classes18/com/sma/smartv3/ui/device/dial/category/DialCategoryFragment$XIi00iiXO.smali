.class public final Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem([Lcom/sma/smartv3/model/WatchFaceCategory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IiI10X:Lcom/sma/smartv3/model/WatchFaceCategory;

.field public final synthetic O00:Lcom/sma/smartv3/model/WatchFaceInfo;

.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

.field public final synthetic XIi00iiXO:I

.field public final synthetic XO0O10:Lcom/sma/smartv3/view/ProgressButton;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/model/WatchFaceCategory;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    iput p2, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->XIi00iiXO:I

    iput p3, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceInfo;

    iput-object p6, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->IiI10X:Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->XIi00iiXO:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->iO:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceInfo;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;->IiI10X:Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v6

    move v3, p1

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->access$syncDial(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

    return-void
.end method
