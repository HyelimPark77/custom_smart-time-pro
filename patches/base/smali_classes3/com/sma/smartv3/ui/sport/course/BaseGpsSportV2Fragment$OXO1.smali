.class public final Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->onLocationWhere(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->access$moveCameraMap(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;Lcom/sma/smartv3/location/CustomLocation;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->access$stopLocationClient(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
